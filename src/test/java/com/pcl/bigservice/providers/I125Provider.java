package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I125Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i179Provider;
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
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b10Provider.get(request);
		int p7Val = b15Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b25Provider.get(request);
		int p12Val = b27Provider.get(request);
		int p13Val = b28Provider.get(request);
		int p14Val = b29Provider.get(request);
		int p15Val = b30Provider.get(request);
		int p16Val = b33Provider.get(request);
		int p17Val = b34Provider.get(request);
		int p18Val = b35Provider.get(request);
		int p19Val = b38Provider.get(request);
		int p20Val = b39Provider.get(request);
		int p21Val = b43Provider.get(request);
		int p22Val = b46Provider.get(request);
		int p23Val = b47Provider.get(request);
		int p24Val = i126Provider.get(request);
		int p25Val = i127Provider.get(request);
		
        try {
            Thread.sleep(32);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p26Val = i130Provider.get(request);
		int p27Val = i131Provider.get(request);
		int p28Val = i134Provider.get(request);
		int p29Val = i135Provider.get(request);
		int p30Val = i136Provider.get(request);
		int p31Val = i137Provider.get(request);
		int p32Val = i139Provider.get(request);
		int p33Val = i140Provider.get(request);
		
        try {
            Thread.sleep(83);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i142Provider.get(request);
		int p35Val = i143Provider.get(request);
		int p36Val = i144Provider.get(request);
		int p37Val = i146Provider.get(request);
		int p38Val = i147Provider.get(request);
		int p39Val = i149Provider.get(request);
		int p40Val = i151Provider.get(request);
		int p41Val = i153Provider.get(request);
		
        try {
            Thread.sleep(65);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p42Val = i155Provider.get(request);
		int p43Val = i156Provider.get(request);
		int p44Val = i161Provider.get(request);
		int p45Val = i162Provider.get(request);
		int p46Val = i167Provider.get(request);
		int p47Val = i170Provider.get(request);
		int p48Val = i177Provider.get(request);
		int p49Val = i179Provider.get(request);
		int p50Val = i181Provider.get(request);
		int p51Val = i182Provider.get(request);
		int p52Val = i184Provider.get(request);
		int p53Val = i186Provider.get(request);
		int p54Val = i187Provider.get(request);
		int p55Val = i188Provider.get(request);
		int p56Val = i189Provider.get(request);
		int p57Val = i194Provider.get(request);
		int p58Val = i196Provider.get(request);
		int p59Val = i200Provider.get(request);

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
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val;
    }
}
