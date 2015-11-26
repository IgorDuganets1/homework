# class jiraTestPage

This class designed for testing JIRA issue tracking software. Every opened page is realized in the separate class. Every action on a page is realized as appropriate method.
Logical connection between web-application’s pages is provided by the instance of current class. This instance is an object of manipulation in the subsequent class

#### *Order of classes:*
- startPage
- loggedInPage
- profilePage
- searchIssuePage
- filterPage

##### *startPage class*

- login(String *login*, String *password*) fills LOGIN field and PASSWORD field by *login* and *password*  values.


##### *loggedInPage class*
- openProfile() calls Profile Page.

- createIssue() calls Issue Create Window.

- issue(String *summary*)  fills field SUMMARY by *summary* value and click Update Button at Issue Create Window. 

- searchIssue(String *summary*) clears, puts *summary* value in the Search feild and clicks Enter. Returns Search Issue Page. 


##### *profilePage class*
######- getUserName()

This method returns User Name from Profile Page.

######- openReportedAndOpen()

This method returns "Reported & Open" Filter's Page.

##### *searchIssuePage*
- getIssueName() returns Summary field value of last issue
