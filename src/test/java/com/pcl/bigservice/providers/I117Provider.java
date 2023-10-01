package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I117Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b14Provider.get(request);
		int p5Val = b18Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b38Provider.get(request);
		int p13Val = b42Provider.get(request);
		int p14Val = b43Provider.get(request);
		int p15Val = b46Provider.get(request);
		int p16Val = b47Provider.get(request);
		int p17Val = b49Provider.get(request);
		
        try {
            Thread.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p18Val = i121Provider.get(request);
		
        try {
            Thread.sleep(67);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = i122Provider.get(request);
		int p20Val = i123Provider.get(request);
		int p21Val = i124Provider.get(request);
		int p22Val = i134Provider.get(request);
		int p23Val = i135Provider.get(request);
		int p24Val = i138Provider.get(request);
		int p25Val = i139Provider.get(request);
		int p26Val = i140Provider.get(request);
		int p27Val = i141Provider.get(request);
		int p28Val = i144Provider.get(request);
		int p29Val = i146Provider.get(request);
		int p30Val = i147Provider.get(request);
		int p31Val = i148Provider.get(request);
		int p32Val = i153Provider.get(request);
		int p33Val = i159Provider.get(request);
		int p34Val = i160Provider.get(request);
		int p35Val = i168Provider.get(request);
		int p36Val = i169Provider.get(request);
		int p37Val = i170Provider.get(request);
		int p38Val = i173Provider.get(request);
		int p39Val = i177Provider.get(request);
		int p40Val = i185Provider.get(request);
		int p41Val = i187Provider.get(request);
		int p42Val = i188Provider.get(request);
		int p43Val = i189Provider.get(request);
		int p44Val = i193Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p45Val = i196Provider.get(request);
		int p46Val = i199Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val;
    }
}
