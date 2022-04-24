package com.kreitek.FileFactory;

import com.kreitek.files.FileSystemItem;

public interface GetFile {

    int getSize();
    String getName();
    FileSystemItem getParent();
    String getFullPath();
    String getExtension();
    byte[] read(int numberOfBytesToRead);
}
