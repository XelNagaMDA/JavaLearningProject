package md.tekwillacademy.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "1 - Execute 'git stash' in the console";
        String step2 = "2 - Perform 'git checkout master' - to move to the local master branch";
        String step3 = "3 - Execute 'git fetch' - to see if there are any changes on remote/origin";
        String step4 = "4 - Execute 'git pull' - this will download the latest changes from origin/master to local master";
        String step5 = "5 - Execute 'git branch New_Branch_Name' to create a new branch that is the same as the local master";
        String step6 = "6 - Perform 'git checkout New_Branch_Name' - as result, we are redirected to the newly created branch";
        String step7 = "7 - Add the task related changes to the solution";
        String step8 = "8 - Execute the 'git commit' command from IntelliJ Idea panel, to store the changes at a local level - on the current branch";
        String step9 = "9 - Execute the 'git push' command form IntelliJ Idea panel -  as a result, a new remote branch is created with origin/New_Branch_Name";
        String step10 = "10 - Create a pull request  from origin/New_Branch_Name into master";
        String step11 = "11 - Add the pull request details, like name, description and reviewers";
        String step12 = "12 - If we collect at least one approval, then we can merge the changes and continue with another tasks";
        String step13 = "13 - If someone asks  for changes, then we should open the project and make sure that we are on the same New_Branch_Name branch";
        String step14 = "14 - Change the requested lines of code";
        String step15 = "15 - Perform a 'git commit amend', to change the latest executed commit, by adding the requested changes ";
        String step16 = "16 - Perform 'git force push' to update the status of pull request";
        String step17 = "17 - Don't forget that locally, you are still on the New_Name_Branch, so move back to master branch";
        String step18 = "18 - Perform 'git fetch' and 'git pull' to update the local master with the latest origin/master changes";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);
        System.out.println(step18);
    }
}
