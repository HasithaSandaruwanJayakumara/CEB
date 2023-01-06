package com.example.ceb.service;



import com.example.ceb.dto.MeterReaderDTO;
import com.example.ceb.entity.MeterReader;
import com.example.ceb.repo.MeterReaderRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MeterReaderService {

    @Autowired
    private MeterReaderRepo meterReaderRepo;

    @Autowired
    private ModelMapper modelMapper;

    public MeterReaderDTO addMeterRederData(MeterReaderDTO meterReaderDTO){
//        if (meterReaderRepo.existsById(meterReaderDTO.getCustomerACN())){
//            return VarList.RSP_DUPLICATED;
//        } else {
//        meterReaderRepo.save(modelMapper.map(meterReaderDTO, MeterReader.class));
//        return VarList.RSP_SUCCESS;
//        }
        meterReaderRepo.save(modelMapper.map(meterReaderDTO, MeterReader.class));
        return meterReaderDTO;


    }
}
