# 📘 Git Cheatsheet

Полезные команды Git, которые ты можешь использовать каждый день.

| Команда                        | Что делает                                                       |
|-------------------------------|------------------------------------------------------------------|
| `git init`                    | Создаёт новый репозиторий в текущей папке                        |
| `git clone <url>`             | Клонирует удалённый репозиторий (например, с GitHub)             |
| `git status`                  | Показывает текущее состояние файлов                              |
| `git add <file>`              | Добавляет файл в staging area для следующего коммита             |
| `git commit -m "сообщение"`   | Делает коммит — фиксирует изменения                              |
| `git log`                     | Показывает историю коммитов                                      |
| `git branch`                  | Показывает все локальные ветки                                   |
| `git branch <name>`           | Создаёт новую ветку                                              |
| `git checkout <ветка>`        | Переключается на указанную ветку                                 |
| `git checkout -b <ветка>`     | Создаёт и сразу переключается на новую ветку                     |
| `git merge <ветка>`           | Сливает указанную ветку в текущую                                |
| `git push`                    | Отправляет изменения на GitHub (если настроено `remote`)         |
| `git push -u origin <ветка>`  | Пушит и привязывает локальную ветку к GitHub-ветке               |
| `git pull`                    | Забирает изменения из GitHub в текущую ветку                     |
| `git remote -v`               | Показывает список привязанных удалённых репозиториев             |
| `git remote add origin <url>` | Привязывает удалённый репозиторий (например, GitHub)             |
| `git diff`                    | Показывает отличия между сохранённым и изменённым файлом         |
| `git reset --hard`            | Полный откат всех изменений до последнего коммита (ОСТОРОЖНО)     |
