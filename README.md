# Espncricinfo-Design
Design of http://espncricinfo.com to improve my low level design skills

## Plan
- [Use Cases](#use-cases)
- [Textual Analysis](#textual-analysis)
- [Initial Design](#initial-design)
- Architecture And Tools Usage
- [Class Design](#class-design)
- [Design Review](#design-review)
- [Development](#development)

## Use Cases
- Admin can add User into system
- User can add Country
- User can add Player
- User can add Umpire(1st and 2nd)
- User can add Commentators
- User can add Refree
- User can add Match(T20, ODI, Test)
- User can add Series(Bilateral or Tournament)
- User can add Schedule
- User can add Telecast Provider

## Textual Analysis
- User
    - Admin
    - General Admin
- Country
 - India
 - Australia
 - South Africa
- Player
 - How to add-all rounder, keeper captain etc. ?
- Umpire
 - 1st Umpire
 - 2nd Umpire
- Refree
- Commentators
 - Different language Commentator
- Match
 - Is it require different properties or sub classes?
- Series
 - Is it require a sub class or just properties
- Schedule
 - Should it contain list of matches?
- Provider
