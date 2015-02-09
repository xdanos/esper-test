package cz.muni;

import com.espertech.esper.client.EPServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EsperServiceImpl implements EsperService {

    @Autowired
    EPServiceProvider epServiceProvider;

    @Override
    public long returnTime() {
       return epServiceProvider.getEPRuntime().getCurrentTime();
    }
}