package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I87Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b19Provider.get(request);
		int p9Val = b22Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b25Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b30Provider.get(request);
		int p15Val = b35Provider.get(request);
		int p16Val = b38Provider.get(request);
		int p17Val = b40Provider.get(request);
		int p18Val = b41Provider.get(request);
		int p19Val = b42Provider.get(request);
		int p20Val = b47Provider.get(request);
		int p21Val = b48Provider.get(request);
		int p22Val = i88Provider.get(request);
		int p23Val = i90Provider.get(request);
		int p24Val = i91Provider.get(request);
		int p25Val = i93Provider.get(request);
		int p26Val = i97Provider.get(request);
		int p27Val = i109Provider.get(request);
		int p28Val = i112Provider.get(request);
		int p29Val = i115Provider.get(request);
		int p30Val = i116Provider.get(request);
		int p31Val = i117Provider.get(request);
		int p32Val = i121Provider.get(request);
		int p33Val = i122Provider.get(request);
		int p34Val = i123Provider.get(request);
		int p35Val = i124Provider.get(request);
		int p36Val = i125Provider.get(request);
		int p37Val = i130Provider.get(request);
		int p38Val = i137Provider.get(request);
		int p39Val = i139Provider.get(request);
		int p40Val = i142Provider.get(request);
		int p41Val = i145Provider.get(request);
		int p42Val = i149Provider.get(request);
		int p43Val = i150Provider.get(request);
		
        try {
            Thread.sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p44Val = i151Provider.get(request);
		int p45Val = i157Provider.get(request);
		int p46Val = i160Provider.get(request);
		int p47Val = i162Provider.get(request);
		int p48Val = i163Provider.get(request);
		int p49Val = i164Provider.get(request);
		int p50Val = i166Provider.get(request);
		int p51Val = i170Provider.get(request);
		int p52Val = i171Provider.get(request);
		int p53Val = i173Provider.get(request);
		int p54Val = i174Provider.get(request);
		int p55Val = i177Provider.get(request);
		int p56Val = i178Provider.get(request);
		
        try {
            Thread.sleep(86);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p57Val = i182Provider.get(request);
		int p58Val = i183Provider.get(request);
		int p59Val = i185Provider.get(request);
		
        try {
            Thread.sleep(55);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p60Val = i186Provider.get(request);
		int p61Val = i189Provider.get(request);
		int p62Val = i191Provider.get(request);
		int p63Val = i193Provider.get(request);
		int p64Val = i194Provider.get(request);
		int p65Val = i197Provider.get(request);
		int p66Val = i198Provider.get(request);
		int p67Val = i200Provider.get(request);

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
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val;
    }
}
