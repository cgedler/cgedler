package ve.com.cge.presentation;

/**
 *
 * @author Christopher Gedler <cgedler@gmail.com>
 * @version 1.0
 */
public class ProgrammingLanguage {
    
    private int _id;
    private String _name;

    public ProgrammingLanguage(int id, String name) {
        this._id = id;
        this._name = name;
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

    @Override
    public String toString() {
        return _name;
    }
    
}
