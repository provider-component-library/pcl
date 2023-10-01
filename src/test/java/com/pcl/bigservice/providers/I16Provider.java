package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I16Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i19Provider;
    @Hard
    private final Provider<Integer> i22Provider;
    @Hard
    private final Provider<Integer> i25Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i28Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i57Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i69Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b11Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b21Provider.get(request);
		int p8Val = b25Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b29Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p11Val = b33Provider.get(request);
		int p12Val = b36Provider.get(request);
		int p13Val = b37Provider.get(request);
		int p14Val = b38Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = b47Provider.get(request);
		int p17Val = b48Provider.get(request);
		int p18Val = b49Provider.get(request);
		int p19Val = i19Provider.get(request);
		int p20Val = i22Provider.get(request);
		int p21Val = i25Provider.get(request);
		int p22Val = i27Provider.get(request);
		int p23Val = i28Provider.get(request);
		int p24Val = i30Provider.get(request);
		int p25Val = i31Provider.get(request);
		int p26Val = i34Provider.get(request);
		int p27Val = i37Provider.get(request);
		int p28Val = i39Provider.get(request);
		int p29Val = i49Provider.get(request);
		int p30Val = i53Provider.get(request);
		int p31Val = i55Provider.get(request);
		int p32Val = i56Provider.get(request);
		int p33Val = i57Provider.get(request);
		int p34Val = i58Provider.get(request);
		int p35Val = i62Provider.get(request);
		int p36Val = i67Provider.get(request);
		int p37Val = i69Provider.get(request);
		int p38Val = i70Provider.get(request);
		int p39Val = i74Provider.get(request);
		int p40Val = i76Provider.get(request);
		int p41Val = i77Provider.get(request);
		int p42Val = i84Provider.get(request);
		int p43Val = i85Provider.get(request);
		int p44Val = i88Provider.get(request);
		int p45Val = i90Provider.get(request);
		int p46Val = i92Provider.get(request);
		int p47Val = i100Provider.get(request);
		int p48Val = i103Provider.get(request);
		int p49Val = i113Provider.get(request);
		int p50Val = i116Provider.get(request);
		int p51Val = i119Provider.get(request);
		
        try {
            Thread.sleep(49);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p52Val = i121Provider.get(request);
		int p53Val = i122Provider.get(request);
		int p54Val = i123Provider.get(request);
		int p55Val = i124Provider.get(request);
		int p56Val = i126Provider.get(request);
		int p57Val = i129Provider.get(request);
		int p58Val = i138Provider.get(request);
		int p59Val = i139Provider.get(request);
		int p60Val = i141Provider.get(request);
		
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p61Val = i142Provider.get(request);
		int p62Val = i144Provider.get(request);
		int p63Val = i145Provider.get(request);
		int p64Val = i150Provider.get(request);
		int p65Val = i153Provider.get(request);
		int p66Val = i156Provider.get(request);
		int p67Val = i157Provider.get(request);
		int p68Val = i161Provider.get(request);
		int p69Val = i162Provider.get(request);
		int p70Val = i166Provider.get(request);
		int p71Val = i167Provider.get(request);
		int p72Val = i168Provider.get(request);
		int p73Val = i169Provider.get(request);
		int p74Val = i181Provider.get(request);
		int p75Val = i190Provider.get(request);
		int p76Val = i191Provider.get(request);
		int p77Val = i192Provider.get(request);
		int p78Val = i193Provider.get(request);
		int p79Val = i197Provider.get(request);
		int p80Val = i199Provider.get(request);

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
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val;
    }
}
