package com.example.codeclan.file_system.components;

import com.example.codeclan.file_system.models.File;
import com.example.codeclan.file_system.models.Folder;
import com.example.codeclan.file_system.models.User;
import com.example.codeclan.file_system.repositories.FileRepository;
import com.example.codeclan.file_system.repositories.FolderRepository;
import com.example.codeclan.file_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    @Override
    public void run(ApplicationArguments args) {
        User robin = new User("Robin");
        userRepository.save(robin);
        Folder projects = new Folder("projects", robin);
        folderRepository.save(projects);
        File homework = new File("homework", "txt", 5, projects);
        fileRepository.save(homework);
        User iain = new User("Iain");
        userRepository.save(iain);
        Folder code = new Folder("code", iain);
        folderRepository.save(code);
        File app = new File("app", "java", 10, code);
        fileRepository.save(app);
    }
    
}
