package com.library.Service;

import com.library.Dao.BookRepo;
import com.library.Model.Book;
import com.library.Model.Dto.BookDto;
import com.library.Model.Mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImp implements BookService {

    private final BookRepo bookRepo;
    private final BookMapper bookMapper;

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book  book=bookRepo.save(bookMapper.toEntity(bookDto));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        Book  book=bookRepo.save(bookMapper.toEntity(bookDto));
        return bookMapper.toDto(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }

    @Override
    public PageImpl<BookDto> getAllBook(BookDto bookDto) {
        Page<Book> books=bookRepo.findAll(PageRequest.of(bookDto.getPage(),
                bookDto.getSize()));
        List<BookDto> bookList=bookMapper.toListDto(books.getContent());
        return new PageImpl<>(bookList,PageRequest.of(bookDto.getPage(),bookDto.getSize()),books.getTotalElements());
    }
}
