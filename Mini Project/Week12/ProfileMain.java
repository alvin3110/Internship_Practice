/*Create an interface called "User" that defines the basic properties of a user such as the name, email, and password.
Create two classes that implement the "User" interface: "RegularUser" and "AdminUser". "RegularUser" should have basic access to the social media platform while "AdminUser" should have additional privileges such as managing user accounts and posts.
Create a class called "Profile" that stores the user profiles and handles the creation and deletion of profiles.
Implement methods in the "Profile" class to search for profiles by name or email, and to update profile information.
Create a class called "Post" that stores the user posts and handles the creation and deletion of posts.
Implement methods in the "Post" class to search for posts by user or content, and to update post information.
Use custom exceptions to handle cases such as duplicate user profiles or invalid user information.*/

import java.util.*;

interface User {
  public String getName();
  public void setName(String name);
  public String getEmail();
  public void setEmail(String email);
  public String getPassword();
  public void setPassword(String password);
}

class RegularUser implements User {
    private String name;
    private String email;
    private String password;

    public RegularUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

  
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


class AdminUser implements User {
    private String name;
    private String email;
    private String password;

    public AdminUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
}


class DuplicateProfileException extends Exception {
    public DuplicateProfileException(String str) {
        super(str);
    }
}

class PostNotFoundException extends Exception {
    public PostNotFoundException(String message) {
        super(message);
    }
}

class ProfileNotFoundException extends Exception {
    public ProfileNotFoundException(String message) {
        super(message);
    }
}

class Profile {
    private List<User> profiles;

    public Profile() {
        profiles = new ArrayList<>();
    }

    public void createProfile(User user) throws DuplicateProfileException {
        if (profiles.contains(user)) {
            throw new DuplicateProfileException("Profile already exists");
        }
        profiles.add(user);
    }

    public void deleteProfile(User user) throws ProfileNotFoundException {
        if (!profiles.contains(user)) {
            throw new ProfileNotFoundException("Profile not found");
        }
        profiles.remove(user);
    }

    public List<User> searchProfileByName(String name) {
        List<User> result = new ArrayList<>();
        for (User user : profiles) {
            if (user.getName().equals(name)) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> searchProfileByEmail(String email) {
        List<User> result = new ArrayList<>();
        for (User user : profiles) {
            if (user.getEmail().equals(email)) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> getProfiles() {
        return profiles;
    }
}
class Post {
    private List<String> posts;

    public Post() {
        posts = new ArrayList<>();
    }

    public void createPost(String post) {
        posts.add(post);
    }

    public void deletePost(String post) throws PostNotFoundException {
        if (!posts.contains(post)) {
            throw new PostNotFoundException("Post not found");
        }
        posts.remove(post);
    }

    public List<String> searchPostsByUser(String user) {
        List<String> results = new ArrayList<>();
        for (String post : posts) {
            if (post.contains(user)) {
                results.add(post);
            }
        }
        return results;
    }

    public List<String> searchPostsByContent(String content) {
        List<String> results = new ArrayList<>();
        for (String post : posts) {
            if (post.contains(content)) {
                results.add(post);
            }
        }
        return results;
    }

    public void updatePost(String oldPost, String newPost) throws PostNotFoundException {
        if (!posts.contains(oldPost)) {
            throw new PostNotFoundException("Post not found");
        }
        posts.set(posts.indexOf(oldPost), newPost);
    }
}

class ProfileMain {
    public static void main(String[] args) {
        // Create users
        User john = new RegularUser("John", "john@gmail.com", "password123");
        User jane = new RegularUser("Jane", "jane@gmail.com", "password456");
        User admin = new AdminUser("Admin", "admin@gmail.com", "admin123");

        // Create profiles
        Profile profile = new Profile();
        try {
            profile.createProfile(john);
            profile.createProfile(jane);
            profile.createProfile(admin);
        } catch (DuplicateProfileException e) {
            System.out.println("Error creating profile: " + e.getMessage());
        }

        // Create posts
        Post post = new Post();
        post.createPost("Jane's first post");
        post.createPost("Admin's first post");

        // Assign posts to users
        try {
            john.setName("John Doe");
            post.createPost("John's first post");
            post.createPost("John's second post");
            post.createPost("John's third post");
        } catch (Exception e) {
            System.out.println("Error creating post: " + e.getMessage());
        }

        try {
            admin.setName("Admin Smith");
            post.createPost("Admin's second post");
        } catch (Exception e) {
            System.out.println("Error creating post: " + e.getMessage());
        }

        // Print posts by user
        System.out.println("Posts by John:");
        for (String p : post.searchPostsByUser("John")) {
            System.out.println("- " + p);
        }

        System.out.println("Posts by Jane:");
        for (String p : post.searchPostsByUser("Jane")) {
            System.out.println("- " + p);
        }

        System.out.println("Posts by Admin:");
        for (String p : post.searchPostsByUser("Admin")) {
            System.out.println("- " + p);
        }

        // Search posts by content
        System.out.println("Posts containing 'first':");
        for (String p : post.searchPostsByContent("first")) {
            System.out.println("- " + p);
        }
    }
}


