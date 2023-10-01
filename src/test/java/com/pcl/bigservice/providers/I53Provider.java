package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I53Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		
        try {
            Thread.sleep(21);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b5Provider.get(request);
		
        try {
            Thread.sleep(81);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b8Provider.get(request);
		int p4Val = b11Provider.get(request);
		int p5Val = b13Provider.get(request);
		
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b17Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b24Provider.get(request);
		int p9Val = b37Provider.get(request);
		int p10Val = b39Provider.get(request);
		int p11Val = b41Provider.get(request);
		int p12Val = b42Provider.get(request);
		int p13Val = b43Provider.get(request);
		int p14Val = b45Provider.get(request);
		int p15Val = b48Provider.get(request);
		int p16Val = b49Provider.get(request);
		int p17Val = i56Provider.get(request);
		int p18Val = i58Provider.get(request);
		int p19Val = i59Provider.get(request);
		int p20Val = i61Provider.get(request);
		int p21Val = i64Provider.get(request);
		int p22Val = i66Provider.get(request);
		int p23Val = i68Provider.get(request);
		int p24Val = i74Provider.get(request);
		int p25Val = i76Provider.get(request);
		int p26Val = i79Provider.get(request);
		int p27Val = i88Provider.get(request);
		int p28Val = i91Provider.get(request);
		int p29Val = i93Provider.get(request);
		int p30Val = i99Provider.get(request);
		int p31Val = i100Provider.get(request);
		int p32Val = i105Provider.get(request);
		int p33Val = i108Provider.get(request);
		int p34Val = i109Provider.get(request);
		int p35Val = i115Provider.get(request);
		int p36Val = i118Provider.get(request);
		int p37Val = i119Provider.get(request);
		int p38Val = i121Provider.get(request);
		int p39Val = i124Provider.get(request);
		int p40Val = i126Provider.get(request);
		int p41Val = i128Provider.get(request);
		int p42Val = i133Provider.get(request);
		int p43Val = i134Provider.get(request);
		int p44Val = i135Provider.get(request);
		int p45Val = i141Provider.get(request);
		int p46Val = i143Provider.get(request);
		int p47Val = i144Provider.get(request);
		int p48Val = i147Provider.get(request);
		int p49Val = i148Provider.get(request);
		int p50Val = i151Provider.get(request);
		int p51Val = i152Provider.get(request);
		int p52Val = i153Provider.get(request);
		int p53Val = i157Provider.get(request);
		int p54Val = i161Provider.get(request);
		int p55Val = i168Provider.get(request);
		int p56Val = i170Provider.get(request);
		int p57Val = i179Provider.get(request);
		int p58Val = i185Provider.get(request);
		int p59Val = i188Provider.get(request);
		int p60Val = i189Provider.get(request);
		int p61Val = i193Provider.get(request);
		int p62Val = i200Provider.get(request);

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
				p62Val;
    }
}
