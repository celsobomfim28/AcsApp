package br.com.acs.DTO.Mapper.Response;

import br.com.acs.Models.Animal;
import br.com.acs.Models.Endereco;
import br.com.acs.Models.Enum.TipoAnimal;
import br.com.acs.Service.AnimalService;
import br.com.acs.Service.EnderecoService;

import java.util.ArrayList;
import java.util.List;

public class ConvertResponse {

    public static List<String> convertTipoAnimalToStr(Integer id){
        List<Animal> list = AnimalService.animalRepository.findAnimalByIdDomicilio(id);

        List<String> name = new ArrayList<>();
        for (Animal a : list){
            name.add(a.getTipoAnimal().name());
        }
        return name;
    }

    public static String convertEnderecoToStr(Integer id){
        Endereco e = EnderecoService.enderecoRepository.findEnderecoByIdDomicilio(id);
        String endereco = e.getTipoLogradouro().name() +e.getNomeLogradouro() +e.getNumero()
                +e.getBairro() +e.getCidade().getNome() + e.getCidade().getEstado().getUf();
        return endereco;
    }
}
