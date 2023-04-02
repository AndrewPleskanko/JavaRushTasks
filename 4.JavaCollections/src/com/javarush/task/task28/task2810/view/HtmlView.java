package com.javarush.task.task28.task2810.view;

import com.javarush.task.task28.task2810.Controller;
import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlView implements View {
    private Controller controller;
    private final String filePath = "./4.JavaCollections/src/" + this.getClass().getPackage().getName().replace(".", "/") + "/vacancies.html";

    @Override
    public void update(List<Vacancy> vacancies) {
        System.out.println(vacancies.size());
        try {
            updateFile(getUpdatedFileContent(vacancies));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    private String getUpdatedFileContent(List<Vacancy> vacancies) {
        Document doc = null;

        try {
            doc = getDocument();
            Element template = doc.getElementsByClass("template").first();
            Element templateCopy = template.clone();
            templateCopy.removeAttr("style");
            templateCopy.removeClass("template");
            doc.select("tr[class=vacancy]").remove();
            for (Vacancy vacancy : vacancies) {
                Element templateVacancy = templateCopy.clone();
                templateVacancy.getElementsByAttributeValue("class", "city").first().text(vacancy.getCity());
                templateVacancy.getElementsByAttributeValue("class", "companyName").first().text(vacancy.getCompanyName());
                templateVacancy.getElementsByAttributeValue("class", "salary").first().text(vacancy.getSalary());
                Element title = templateVacancy.getElementsByTag("a").first();
                title.text(vacancy.getTitle());
                title.attr("href", vacancy.getUrl());
                template.before(templateVacancy);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Some exception occurred";
        }
        return doc.toString();
    }

    private void updateFile(String string) {
        try {
            File file = new File(filePath);
            FileWriter writer = new FileWriter(file);
            writer.write(string);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    }

    protected Document getDocument() throws IOException {
        return Jsoup.parse(new File(filePath), "UTF-8");
    }
}
