package com.kreitek.FileFactory;

import java.util.List;

import com.kreitek.files.FileSystemItem;

public interface AddFile {

    void setParent(FileSystemItem directory);
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
}
