# Flexible Notification System – Week 5

## Overview
This project implements the Strategy Design Pattern in Java to provide flexible notification delivery. 

The system allows switching between different notification services (Email, SMS, WhatsApp) without modifying the core alert logic.

This project builds on Week 4 by improving modularity and extending notification capabilities.

---

## Design Pattern Used
Strategy Design Pattern

The AlertSystem class delegates notification behavior to interchangeable strategy implementations:
- EmailService
- SMSService
- WhatsAppService

This ensures:
- Loose coupling
- Easy extensibility
- Minimal code modification when adding new notification types

---

## Project Structure

- AlertSystem.java – Context class
- NotificationMedium.java – Strategy interface
- EmailService.java – Concrete strategy
- SMSService.java – Concrete strategy
- WhatsAppService.java – Concrete strategy
- Main.java – Demonstrates system behavior

---

## Prerequisites

- Java JDK 17 or higher
- Terminal or IDE (VS Code, IntelliJ, etc.)

Check version:
