package pl.sda.javalondek4springdemo.converter;

import org.springframework.stereotype.Component;
import pl.sda.javalondek4springdemo.dto.ItemDto;
import pl.sda.javalondek4springdemo.model.Item;

@Component
public class ItemMapper implements Mapper<Item, ItemDto> {

    private final CategoryMapper categoryMapper;

    public ItemMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public ItemDto fromEntityToDto(Item entity) {
        return new ItemDto(entity.getId(), categoryMapper.fromEntityToDto(entity.getCategory()),
                entity.getPrice(), entity.getName());
    }

    @Override
    public Item fromDtoToEntity(ItemDto dto) {
        return null;
    }
}
