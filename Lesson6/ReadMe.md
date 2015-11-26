# class jiraTestPage

This class designed for testing JIRA issue tracking software. Every opened page is realized in the separate class. Every action on a page is realized as appropriate method.
Logical connection between web-application’s pages is provided by the instance of current class. This instance is an object of manipulation in the subsequent class

##### *Order of classes:*
- startPage
- loggedInPage
- profilePage
- searchIssuePage
- filterPage

###### *startPage class*

Metods:
- login

This method organize login procedure and has 2 arguments : String *login*, String *password*

###### *loggedInPage class*
- openProfile

This method call Profile Page.

- createIssue

This method call Issue Create Window.

- issue

This method fills field SUMMARY by *summary* value and click Update Button at Issue Create Window. Argument: String *summary* 
