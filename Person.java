package ve.com.cge.presentation;

import java.util.List;

/**
 *
 * @author Christopher Gedler <cgedler@gmail.com>
 * @version 1.0
 */
public class Person {
    
    private int _id;
    private String _name;
    private List<ProgrammingLanguage> _languages;

    public Person(int id, String name, List<ProgrammingLanguage> languages) {
        this._id = id;
        this._name = name;
        this._languages = languages;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public List<ProgrammingLanguage> getLanguages() {
        return _languages;
    }

    public void setLanguages(List<ProgrammingLanguage> languages) {
        this._languages = languages;
    }
    
}
