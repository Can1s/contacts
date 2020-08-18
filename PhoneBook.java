package contacts;

import java.util.ArrayList;
import java.util.List;

class PhoneBook {

    private List<Human> contacts = new ArrayList<>();


    public void addHuman(Human human) {
        contacts.add(human);
    }


    public void removeHuman(int index) {
        contacts.remove(--index);
    }


    public void editHuman(int index, Human human) {
        contacts.set(--index, human);
    }


    public int getListSize() {
        return contacts.size();
    }


    public void getList() {
        for (int i = 0, j = 1; i < contacts.size(); i++, j++) {
            System.out.println(j + ". " + contacts.get(i));
        }
    }


    public Human getHuman(int id) {
        return contacts.get(--id);
    }

}
