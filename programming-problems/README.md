# PROGRAMMING PROBLEMS

Hi Team, in first part of this internship you will work on some basic programming problems.

Yor assignments are present in introAssignmets and dataManipulation folders in root of this project.

For every solution create new java class with name of your Assignment (Path is `src.main.java.introAssignments` or `src.main.java.dataManipulation`) - e.g. Assignment1.class - here you should implement task methods.

For specific tasks you will need to create new classes for task itself, just name it as task demands and put in correct folder.

## GIT process

*1. Clone project:*

First you need to set your global git credentials to ones from gitlab you are using:\
***git config --global user.name "Your gitlab username"***
***git config --global user.email "Your gitlab email"***

Create folder where you want to store this project, open terminal at this folder and type:\
***git clone https://gitlab.com/marko.stojic/test-automation-internship.git***

After this line is executed, you should be prompted to enter your gitlab password.
After password is entered your project should be cloned, you can open it now in IDEA.

*2. Branching and merging:*

You can see four branches in this repository, master and branches with each intern name.
Master branch contains assignments and some test data, it is just for read purposes, you won't be able to push anything there.

Actual work will take place on branch that has your name - click on lower right part of your IDEA screen and you can see all branches listed.
Click on your branch name and checkout it.

You won't be able to push your changes directly to your remote branch.
First create feature branch with name *fb-name-lastname* that branches from branch with your name - You can do it from IDEA
(You need to checkout your branch and again click on lower right corner of IDEA and click create new branch - name it *fb-name-lastname*)

Now you have created your local feature branch, here you can start with your work, after you have completed e.g. first assignment
commit your changes (You can use IDEA git utility - in upper right corner there is button that does that)

After you have committed changes you can push and create remote branch with one line command:

***git push --set-upstream origin fb-name-lastname***

After that you need to create merge request for merging remote *fb-name-lastname* to remote *name-lastname branch*. (You can create merge request from gitlab UI itself)
It will notify mentors and after changes are reviewed and all comments fixed it will merged by mentor.

After remote *fb-name-lastname* is merged to remote *name-lastname* remote version of *fb-name-lastname* branch should be automatically deleted.

As you can notice your *name-lastname* doesn't have latest changes, to get your recently merged changes from remote do the following:

1. Set your *name-lastname* to track its remote counterpart:

***git branch --set-upstream-to origin/name-lastname***

1. Pull and merge changes locally - Update project button from upper right corner in IDEA git utility does everything for you

Now you again can create new *fb-name-lastname* branch from your *fb-name-lastname* branch for next task and repeat the process :)
