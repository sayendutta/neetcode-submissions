class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            String filteredLocal = email.split("@")[0].split("\\+")[0].replace(".", "");
            String domain = email.split("@")[1];
            unique.add(filteredLocal + "@" + domain);
        }
        return unique.size();
    }
}