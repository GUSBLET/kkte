package ccte.project.technical.mapper;

import java.util.List;


public interface Mapper<D, E> {

    D toDto(E entity);

    E toEntity(D dto) ;

    default List<D> toDtoList(List<E> entityList) {
        return entityList.stream().map(this::toDto).toList();
    }

    default List<E> toEntityList(List<D> dtoList) {
        return dtoList.stream().map(this::toEntity).toList();
    }
}
