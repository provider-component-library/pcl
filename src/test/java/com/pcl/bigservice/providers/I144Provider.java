package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I144Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b12Provider.get(request);
		int p4Val = b15Provider.get(request);
		int p5Val = b19Provider.get(request);
		int p6Val = b20Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b24Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b26Provider.get(request);
		int p11Val = b28Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b34Provider.get(request);
		int p14Val = b35Provider.get(request);
		int p15Val = b36Provider.get(request);
		int p16Val = b40Provider.get(request);
		int p17Val = b41Provider.get(request);
		int p18Val = b42Provider.get(request);
		int p19Val = b44Provider.get(request);
		
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p20Val = b45Provider.get(request);
		
        try {
            Thread.sleep(46);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = b49Provider.get(request);
		int p22Val = b50Provider.get(request);
		int p23Val = i146Provider.get(request);
		int p24Val = i151Provider.get(request);
		int p25Val = i152Provider.get(request);
		int p26Val = i153Provider.get(request);
		int p27Val = i155Provider.get(request);
		int p28Val = i156Provider.get(request);
		int p29Val = i160Provider.get(request);
		int p30Val = i162Provider.get(request);
		int p31Val = i168Provider.get(request);
		int p32Val = i169Provider.get(request);
		int p33Val = i170Provider.get(request);
		int p34Val = i174Provider.get(request);
		int p35Val = i180Provider.get(request);
		int p36Val = i181Provider.get(request);
		int p37Val = i182Provider.get(request);
		int p38Val = i184Provider.get(request);
		int p39Val = i186Provider.get(request);
		int p40Val = i187Provider.get(request);
		int p41Val = i188Provider.get(request);
		int p42Val = i192Provider.get(request);
		int p43Val = i193Provider.get(request);
		int p44Val = i194Provider.get(request);
		int p45Val = i195Provider.get(request);
		int p46Val = i196Provider.get(request);
		int p47Val = i198Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p48Val = i200Provider.get(request);

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
				p46Val +
				p47Val +
				p48Val;
    }
}
