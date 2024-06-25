package com.library.Service;

import com.library.Model.Book;
import com.library.Model.Dto.BookDto;
import org.springframework.data.domain.PageImpl;

import java.util.List;

public interface BookService {

    BookDto createBook(BookDto bookDto);

    BookDto updateBook(BookDto bookDto);

    void deleteBookById(Long id);

    PageImpl<BookDto> getAllBook(BookDto bookDto);
}
