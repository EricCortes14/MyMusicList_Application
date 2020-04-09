package Objects;

import java.util.UUID;

/**
 * Last updated 04.02.2020
 * @author Quinn Tjin-A-Soe, Fernando Villarreal
 */
public class RecordObject {

    protected String uuid;
    protected String name;
    protected int id;
    protected boolean active = true;
// ================================ CONSTRUCTORS ====================================

    public RecordObject() {
        this.setUuid(RecordObject.generateUuid());
    }

    public RecordObject(String uuid, String name, int id) {
        this.uuid = uuid;
        this.name = name;
        this.id = id;
    }

// ================================ METHODS ====================================
    public void makeActive() {
        this.active = true;
    }

    public void makeInactive() {
        this.active = false;
    }

    protected static String generateUuid() {
        return UUID.randomUUID().toString();
    }

// ================================ GETTERS ====================================
    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    // ================================ SETTERS ================================

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
