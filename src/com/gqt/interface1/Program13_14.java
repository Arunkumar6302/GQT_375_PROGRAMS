package com.gqt.interface1;

interface MySerializable {
    void serialize();
}

interface MyDeserializable {
    void deserialize();
}

class FileData implements MySerializable {
    public void serialize() {
        System.out.println("File serialized");
    }
}

class Database implements MyDeserializable {
    public void deserialize() {
        System.out.println("Database deserialized");
    }
}

public class Program13_14 {
    public static void main(String[] args) {
        FileData f = new FileData();
        Database d = new Database();

        f.serialize();
        d.deserialize();
    }
}

