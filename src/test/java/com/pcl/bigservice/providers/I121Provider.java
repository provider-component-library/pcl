package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I121Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b6Provider.get(request);
		int p6Val = b7Provider.get(request);
		
        try {
            Thread.sleep(78);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p7Val = b8Provider.get(request);
		int p8Val = b9Provider.get(request);
		int p9Val = b13Provider.get(request);
		int p10Val = b14Provider.get(request);
		int p11Val = b15Provider.get(request);
		int p12Val = b18Provider.get(request);
		int p13Val = b19Provider.get(request);
		int p14Val = b21Provider.get(request);
		int p15Val = b25Provider.get(request);
		int p16Val = b26Provider.get(request);
		int p17Val = b32Provider.get(request);
		int p18Val = b35Provider.get(request);
		int p19Val = b36Provider.get(request);
		int p20Val = b37Provider.get(request);
		int p21Val = i123Provider.get(request);
		int p22Val = i128Provider.get(request);
		int p23Val = i129Provider.get(request);
		int p24Val = i133Provider.get(request);
		
        try {
            Thread.sleep(81);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i135Provider.get(request);
		int p26Val = i136Provider.get(request);
		int p27Val = i138Provider.get(request);
		int p28Val = i143Provider.get(request);
		int p29Val = i146Provider.get(request);
		int p30Val = i152Provider.get(request);
		int p31Val = i153Provider.get(request);
		int p32Val = i155Provider.get(request);
		int p33Val = i158Provider.get(request);
		int p34Val = i159Provider.get(request);
		int p35Val = i160Provider.get(request);
		int p36Val = i161Provider.get(request);
		int p37Val = i164Provider.get(request);
		int p38Val = i165Provider.get(request);
		int p39Val = i166Provider.get(request);
		int p40Val = i167Provider.get(request);
		int p41Val = i168Provider.get(request);
		
        try {
            Thread.sleep(87);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p42Val = i170Provider.get(request);
		int p43Val = i173Provider.get(request);
		int p44Val = i177Provider.get(request);
		int p45Val = i178Provider.get(request);
		int p46Val = i179Provider.get(request);
		int p47Val = i180Provider.get(request);
		int p48Val = i181Provider.get(request);
		int p49Val = i182Provider.get(request);
		int p50Val = i183Provider.get(request);
		int p51Val = i185Provider.get(request);
		int p52Val = i191Provider.get(request);
		int p53Val = i193Provider.get(request);
		int p54Val = i195Provider.get(request);
		int p55Val = i196Provider.get(request);

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
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val;
    }
}
