# NCaptcha README

Welcome to the NCaptcha plugin README! NCaptcha is crafted for Minecraft servers, aiming to enhance server security by implementing a captcha challenge using an anvil interface for new players. This unique approach requires players to enter numbers displayed in a complex format, helping to thwart bots from automating entry.

## Table of Contents 📃

- [Description](#description)
- [Written On](#written-on)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Features](#features)
- [Configuration](#configuration)
- [Messages](#messages)
- [Contacts](#contacts)

## Description 💙

NCaptcha is a vital security plugin designed to prevent automated bot entries on Minecraft servers. Upon player login, it presents a captcha in an anvil GUI, where players must manually enter numbers displayed in Unicode to continue. This method ensures that only real players can interact and play, securing the server against potential abuses.

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

NCaptcha — это важный плагин безопасности, предназначенный для предотвращения автоматического входа ботов на серверы Minecraft. При входе игрока он представляет капчу в GUI наковальни, где игроки должны вручную ввести числа, отображаемые в Unicode, чтобы продолжить. Этот метод гарантирует, что только настоящие игроки могут взаимодействовать и играть, защищая сервер от потенциальных злоупотреблений.

## Written on 👩‍💻
![Java](https://img.shields.io/badge/-Java-FFA500?style=for-the-badge&logo=java&logoColor=0000CD)
![Bukkit](https://img.shields.io/badge/-Bukkit-7B68EE?style=for-the-badge)

## Screenshots 📸


### Installation 🌙

1. Download the NCaptcha plugin from its [official repository](https://github.com/n1zamu/NCaptcha).
2. Place the downloaded `.jar` file into your server's `plugins` folder.
3. Restart the server to load the plugin.
4. Fine-tune the plugin as required (see [Configuration](#configuration)).

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

1. Скачайте плагин NCaptcha из [официального репозитория](https://github.com/n1zamu/NCaptcha).
2. Поместите скачанный файл `.jar` в папку `plugins` вашего сервера.
3. Перезагрузите сервер для загрузки плагина.
4. Настройте плагин по мере необходимости (см. [Настройки](#настройки)).

## Features 🌟

- **Anvil GUI Captcha:** Unique captcha interface using an anvil for number input.
- **Unicode Number Challenge:** Enhances security by requiring players to input numbers in Unicode format.
- **Time-limited Responses:** Players have a set time to respond to the captcha, enhancing prompt participation.
- **Sound Notifications:** Optional sound notifications to alert players upon captcha completion or failure.
- **Multilanguage Support:** Supports notifications in multiple languages.

  ![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

- **Капча с GUI наковальни:** Уникальный интерфейс капчи, использующий наковальню для ввода чисел.
- **Вызов числового ввода в Unicode:** Повышает безопасность, требуя от игроков ввода чисел в формате Unicode.
- **Ограниченное по времени реагирование:** Игрокам дается установленное время для ответа на капчу, что способствует оперативному участию.
- **Звуковые уведомления:** Опциональные звуковые уведомления для оповещения игроков о завершении или неудаче капчи.
- **Мультиязычная поддержка:** Поддержка уведомлений на нескольких языках.

## Configuration Options ⚙️

- **time**: `60` - Time in seconds for players to solve the captcha.
- **notification**: `true` - Notify players of their success or failure in solving the captcha.
- **sound**: `true` - Enable sound notifications for captcha events.
- **soundType**: `"ENTITY_EXPERIENCE_ORB_PICKUP"` - Define the sound type for notifications.
- **message**: `true` - Send notifications as chat messages.
- **title**: `false` - Display notifications as full-screen messages.

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

- **time**: `60` - Время в секундах, за которое игроки должны разгадать капчу.
- **notification**: `true` - Уведомлять игроков об успехе или неудаче в разгадывании капчи.
- **звук**: `true` - Включить звуковые уведомления о событиях в капче.
- **soundType**: `"ENTITY_EXPERIENCE_ORB_PICKUP"` - Определяет тип звука для уведомлений.
- **message**: `true` - Отправлять уведомления в виде сообщений чата.
- **title**: `false` - Отображать уведомления в виде полноэкранных сообщений.
  
## Messages 📝

- **successfullyMessage**: "&aCaptcha successfully completed. Enjoy your game!"
- **kickMessage**: "&cYou did not pass the captcha!"
- **bossBarName**: "&f(Time left %timeLeft% seconds)"
- **anvilName**: "&7Enter the number %number%"

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

- **successfullyMessage**: "&aCaptcha успешно пройдена. Приятной игры!"
- **kickMessage**: "&cВы не прошли капчу!"
- **bossBarName**: "&f(Осталось %timeLeft% секунд)"
- **anvilName**: "&7Введите число %number%"

## Contacts 🔊

### My Discord Tag: n1zamu
![Discord](https://img.shields.io/badge/-Discord-4169E1?style=for-the-badge&logo=discord&logoColor=FFFFFF)
