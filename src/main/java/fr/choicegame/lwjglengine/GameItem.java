package fr.choicegame.lwjglengine;

import org.joml.Vector3f;

import fr.choicegame.lwjglengine.graph.Mesh;

public class GameItem {

    private Mesh mesh;

    private final Vector3f position;

    private float scale;

    private final Vector3f rotation;

    public GameItem() {
    	this(null);
    }
    
    public GameItem(Mesh mesh) {
        this.mesh = mesh;
        position = new Vector3f(0, 0, 0);
        scale = 1;
        rotation = new Vector3f(0, 0, 0);
    }

    public Vector3f getPosition() {
        return position;
    }

    public GameItem setPosition(float x, float y, float z) {
        this.position.x = x;
        this.position.y = y;
        this.position.z = z;
        return this;
    }

    public float getScale() {
        return scale;
    }

    public GameItem setScale(float scale) {
        this.scale = scale;
        return this;
    }

    public Vector3f getRotation() {
        return rotation;
    }

    public GameItem setRotation(float x, float y, float z) {
        this.rotation.x = x;
        this.rotation.y = y;
        this.rotation.z = z;
        return this;
    }

    public Mesh getMesh() {
        return mesh;
    }
    
    public void setMesh(Mesh mesh){
    	this.mesh = mesh;
    }
}