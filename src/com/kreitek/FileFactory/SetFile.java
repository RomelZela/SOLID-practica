package com.kreitek.FileFactory;

public interface SetFile {
	
    void setName(String name);
    void write(byte[] buffer);
    void setPosition(int numberOfBytesFromBeginning);
    void open();
    void close();

}
