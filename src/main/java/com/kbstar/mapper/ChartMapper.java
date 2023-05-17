package com.kbstar.mapper;

import com.kbstar.dto.Chart;
import com.kbstar.dto.Chart2;
import com.kbstar.dto.Chart3;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ChartMapper {
    List<Chart> getMonthlyTotal();
    List<Chart2> getCateTotal();
    List<Chart3> getAgeTotal();
}
