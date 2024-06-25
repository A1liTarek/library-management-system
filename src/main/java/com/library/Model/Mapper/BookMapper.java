package com.library.Model.Mapper;

import com.library.Model.Book;
import com.library.Model.Dto.BookDto;
import org.mapstruct.Mapper;
import java.util.List;


@Mapper(componentModel = "spring")
public interface BookMapper{

    BookDto toDto(Book book);

    Book toEntity(BookDto bookDto);

    List<BookDto> toListDto(List<Book> book);
}
