package com.mbh.application;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {

    String[] springConfig = {"spring/batch/config/context.xml"};

    ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

    JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

    // Call successively extractProducts then extractProductsForConversion ..
    Job job = (Job) context.getBean(args[0]);

    try {

      JobExecution execution = jobLauncher.run(job, new JobParameters());
      System.out.println("Exit Status : " + execution.getStatus());

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Done");
  }
}
