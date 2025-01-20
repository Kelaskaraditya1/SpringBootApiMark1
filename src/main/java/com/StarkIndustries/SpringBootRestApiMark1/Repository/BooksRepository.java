package com.StarkIndustries.SpringBootRestApiMark1.Repository;

import com.StarkIndustries.SpringBootRestApiMark1.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {
}
