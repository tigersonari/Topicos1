package br.twice.model.converterjpa;

import br.twice.model.Regiao;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RegiaoConverter implements AttributeConverter<Regiao, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Regiao regiao) {

    //if (regiao == null)
    //return null;
    //return regiao.getId();

            return regiao == null ? null : regiao.getId();

    }

    @Override
    public Regiao convertToEntityAttribute(Integer id) {
        return Regiao.valueOf(id);
    }
    
}
