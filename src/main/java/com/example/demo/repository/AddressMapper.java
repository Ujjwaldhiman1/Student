//package com.example.demo.repository;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;
//
//import com.example.demo.model.Address;
//import com.example.demo.model.AddressDto;
//import com.example.demo.model.User;
//
//@Mapper
//public interface AddressMapper {
//	AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
//
//    @Mapping(source = "user.id", target = "userid")
//    AddressDto toDto(User user, Address address);
//}
