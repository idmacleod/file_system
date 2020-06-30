package com.example.codeclan.file_system.repositories;

import com.example.codeclan.file_system.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
