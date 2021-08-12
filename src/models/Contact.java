package models;

public class Contact {
    private Integer id;
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public Contact addCodeToPhone(String code) {
        this.phone = code + phone;
        return this;
    }
}
