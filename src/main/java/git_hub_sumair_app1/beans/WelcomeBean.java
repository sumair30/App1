package git_hub_sumair_app1.beans;

public class WelcomeBean {

	private final String id;
    private final String content;

    public WelcomeBean(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}