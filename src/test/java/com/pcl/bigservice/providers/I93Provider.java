package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I93Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b4Provider.get(request);
		int p5Val = b7Provider.get(request);
		int p6Val = b10Provider.get(request);
		int p7Val = b11Provider.get(request);
		
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b13Provider.get(request);
		int p9Val = b16Provider.get(request);
		int p10Val = b19Provider.get(request);
		int p11Val = b20Provider.get(request);
		int p12Val = b21Provider.get(request);
		int p13Val = b25Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b30Provider.get(request);
		int p16Val = b37Provider.get(request);
		int p17Val = b42Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b44Provider.get(request);
		int p20Val = i95Provider.get(request);
		
        try {
            Thread.sleep(65);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i96Provider.get(request);
		int p22Val = i99Provider.get(request);
		int p23Val = i103Provider.get(request);
		int p24Val = i104Provider.get(request);
		int p25Val = i106Provider.get(request);
		int p26Val = i110Provider.get(request);
		int p27Val = i112Provider.get(request);
		int p28Val = i117Provider.get(request);
		int p29Val = i120Provider.get(request);
		int p30Val = i121Provider.get(request);
		int p31Val = i123Provider.get(request);
		int p32Val = i124Provider.get(request);
		int p33Val = i126Provider.get(request);
		int p34Val = i128Provider.get(request);
		int p35Val = i131Provider.get(request);
		int p36Val = i132Provider.get(request);
		int p37Val = i133Provider.get(request);
		int p38Val = i135Provider.get(request);
		int p39Val = i139Provider.get(request);
		int p40Val = i141Provider.get(request);
		int p41Val = i142Provider.get(request);
		int p42Val = i143Provider.get(request);
		int p43Val = i146Provider.get(request);
		int p44Val = i147Provider.get(request);
		int p45Val = i151Provider.get(request);
		int p46Val = i153Provider.get(request);
		
        try {
            Thread.sleep(86);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p47Val = i155Provider.get(request);
		int p48Val = i156Provider.get(request);
		int p49Val = i157Provider.get(request);
		int p50Val = i162Provider.get(request);
		int p51Val = i166Provider.get(request);
		int p52Val = i167Provider.get(request);
		int p53Val = i171Provider.get(request);
		int p54Val = i176Provider.get(request);
		int p55Val = i179Provider.get(request);
		int p56Val = i183Provider.get(request);
		int p57Val = i184Provider.get(request);
		int p58Val = i186Provider.get(request);
		int p59Val = i188Provider.get(request);
		int p60Val = i189Provider.get(request);
		int p61Val = i190Provider.get(request);
		int p62Val = i191Provider.get(request);
		int p63Val = i200Provider.get(request);

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
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val;
    }
}
