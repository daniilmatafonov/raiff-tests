
# Автотесты для демо-страницы Raiffeisen
- Создание финансовой цели
- Досрочное закрытие потребительского кредита
- Просмотр основных банковских операций

Сборка тестов на локальном окружении:

`clean test -Denv=local`

Сборка и запуск тестов в Selenoid:

`clean test -Denv=remote -Dbrowser=chrome -Dbrowser_version=87.0 -Dvideo_storage="https://selenoid.autotests.cloud/video/" -Dremote_url="https://user1:1234@selenoid.autotests.cloud:4444/wd/hub" -Dthreads=1`

## Видео о прохождении тестов
![Video](src/test/resources/video/video.gif)

## Отчёт в Allure
![Allure](src/test/resources/img/allure.jpg)

https://jenkins.autotests.cloud/job/C04-G18-dmatafonov-raiff/allure/

## Уведомления в Slack
![Slack](src/test/resources/img/Slack_notification.jpg)


![Selenide](src/test/resources/img/selenide.png)![Gradle](src/test/resources/img/gradle.png)![Java](src/test/resources/img/java.png)![JUnit5](src/test/resources/img/jUnit5.png)![Allure_Report](src/test/resources/img/allure-logo.png)![Jenkins](src/test/resources/img/jenkins.png)![Slack](src/test/resources/img/slack-logo.png)