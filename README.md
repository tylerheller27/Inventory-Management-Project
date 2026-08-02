# Inventory-Management-Project

Work in progress — a console-based Java app for managing departments and employees (despite the "inventory" name).

## How it works

Running `Main` starts a text menu where you can create departments, create employees and assign them to a department, and list what's been created. Everything is kept in memory (`ObjectStorage`), so data resets each time you run the program.

- `Main` — runs the menu loop and holds the shared storage/scanner
- `DepartmentMenu` / `UserMenu` — submenus for creating departments and employees
- `Department` / `User` — simple data models
- `Validation` — checks user input (letters only, valid gender, etc.)

