package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I132Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b5Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b19Provider.get(request);
		int p8Val = b20Provider.get(request);
		int p9Val = b21Provider.get(request);
		int p10Val = b26Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b28Provider.get(request);
		int p13Val = b29Provider.get(request);
		int p14Val = b33Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = b47Provider.get(request);
		int p18Val = i134Provider.get(request);
		int p19Val = i135Provider.get(request);
		int p20Val = i143Provider.get(request);
		int p21Val = i145Provider.get(request);
		int p22Val = i146Provider.get(request);
		int p23Val = i147Provider.get(request);
		int p24Val = i148Provider.get(request);
		int p25Val = i149Provider.get(request);
		
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p26Val = i155Provider.get(request);
		int p27Val = i156Provider.get(request);
		int p28Val = i159Provider.get(request);
		int p29Val = i160Provider.get(request);
		int p30Val = i162Provider.get(request);
		int p31Val = i163Provider.get(request);
		int p32Val = i167Provider.get(request);
		int p33Val = i172Provider.get(request);
		int p34Val = i180Provider.get(request);
		int p35Val = i183Provider.get(request);
		int p36Val = i185Provider.get(request);
		
        try {
            Thread.sleep(58);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p37Val = i186Provider.get(request);
		
        try {
            Thread.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i187Provider.get(request);
		int p39Val = i193Provider.get(request);
		int p40Val = i194Provider.get(request);
		int p41Val = i195Provider.get(request);
		int p42Val = i196Provider.get(request);
		int p43Val = i197Provider.get(request);
		int p44Val = i198Provider.get(request);
		int p45Val = i199Provider.get(request);
		int p46Val = i200Provider.get(request);

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
