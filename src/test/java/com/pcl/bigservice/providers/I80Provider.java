package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I80Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b18Provider.get(request);
		int p9Val = b19Provider.get(request);
		int p10Val = b26Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b30Provider.get(request);
		int p13Val = b41Provider.get(request);
		int p14Val = b42Provider.get(request);
		int p15Val = b44Provider.get(request);
		int p16Val = b48Provider.get(request);
		int p17Val = i81Provider.get(request);
		int p18Val = i84Provider.get(request);
		int p19Val = i87Provider.get(request);
		int p20Val = i90Provider.get(request);
		int p21Val = i92Provider.get(request);
		int p22Val = i93Provider.get(request);
		int p23Val = i95Provider.get(request);
		int p24Val = i96Provider.get(request);
		int p25Val = i99Provider.get(request);
		
        try {
            Thread.sleep(26);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p26Val = i100Provider.get(request);
		int p27Val = i101Provider.get(request);
		int p28Val = i102Provider.get(request);
		int p29Val = i104Provider.get(request);
		int p30Val = i108Provider.get(request);
		int p31Val = i111Provider.get(request);
		int p32Val = i112Provider.get(request);
		int p33Val = i113Provider.get(request);
		int p34Val = i114Provider.get(request);
		int p35Val = i115Provider.get(request);
		int p36Val = i119Provider.get(request);
		int p37Val = i121Provider.get(request);
		
        try {
            Thread.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i125Provider.get(request);
		int p39Val = i130Provider.get(request);
		int p40Val = i132Provider.get(request);
		int p41Val = i142Provider.get(request);
		int p42Val = i146Provider.get(request);
		int p43Val = i151Provider.get(request);
		int p44Val = i154Provider.get(request);
		int p45Val = i155Provider.get(request);
		int p46Val = i157Provider.get(request);
		
        try {
            Thread.sleep(38);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p47Val = i162Provider.get(request);
		int p48Val = i165Provider.get(request);
		int p49Val = i170Provider.get(request);
		int p50Val = i172Provider.get(request);
		int p51Val = i182Provider.get(request);
		int p52Val = i187Provider.get(request);
		int p53Val = i188Provider.get(request);
		int p54Val = i189Provider.get(request);
		int p55Val = i190Provider.get(request);
		int p56Val = i191Provider.get(request);
		int p57Val = i194Provider.get(request);
		int p58Val = i195Provider.get(request);
		int p59Val = i197Provider.get(request);
		int p60Val = i200Provider.get(request);

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
				p60Val;
    }
}
