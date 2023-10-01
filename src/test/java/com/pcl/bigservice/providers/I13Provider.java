package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I13Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
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
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i16Provider;
    @Hard
    private final Provider<Integer> i19Provider;
    @Hard
    private final Provider<Integer> i21Provider;
    @Hard
    private final Provider<Integer> i22Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i118Provider;
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
    private final Provider<Integer> i127Provider;
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
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b26Provider.get(request);
		int p9Val = b30Provider.get(request);
		int p10Val = b33Provider.get(request);
		int p11Val = b34Provider.get(request);
		int p12Val = b36Provider.get(request);
		int p13Val = b37Provider.get(request);
		int p14Val = b39Provider.get(request);
		int p15Val = b42Provider.get(request);
		int p16Val = b43Provider.get(request);
		int p17Val = b45Provider.get(request);
		int p18Val = b48Provider.get(request);
		int p19Val = b49Provider.get(request);
		int p20Val = b50Provider.get(request);
		int p21Val = i16Provider.get(request);
		int p22Val = i19Provider.get(request);
		int p23Val = i21Provider.get(request);
		int p24Val = i22Provider.get(request);
		int p25Val = i30Provider.get(request);
		int p26Val = i38Provider.get(request);
		int p27Val = i49Provider.get(request);
		int p28Val = i53Provider.get(request);
		int p29Val = i54Provider.get(request);
		int p30Val = i60Provider.get(request);
		int p31Val = i66Provider.get(request);
		int p32Val = i73Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p33Val = i75Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i77Provider.get(request);
		int p35Val = i80Provider.get(request);
		int p36Val = i81Provider.get(request);
		int p37Val = i96Provider.get(request);
		int p38Val = i97Provider.get(request);
		int p39Val = i98Provider.get(request);
		int p40Val = i102Provider.get(request);
		int p41Val = i105Provider.get(request);
		int p42Val = i106Provider.get(request);
		int p43Val = i113Provider.get(request);
		int p44Val = i114Provider.get(request);
		int p45Val = i118Provider.get(request);
		int p46Val = i120Provider.get(request);
		int p47Val = i121Provider.get(request);
		int p48Val = i123Provider.get(request);
		int p49Val = i124Provider.get(request);
		int p50Val = i126Provider.get(request);
		int p51Val = i127Provider.get(request);
		int p52Val = i128Provider.get(request);
		int p53Val = i131Provider.get(request);
		int p54Val = i132Provider.get(request);
		int p55Val = i133Provider.get(request);
		int p56Val = i135Provider.get(request);
		int p57Val = i137Provider.get(request);
		int p58Val = i138Provider.get(request);
		int p59Val = i140Provider.get(request);
		int p60Val = i142Provider.get(request);
		int p61Val = i144Provider.get(request);
		int p62Val = i147Provider.get(request);
		int p63Val = i153Provider.get(request);
		int p64Val = i159Provider.get(request);
		int p65Val = i161Provider.get(request);
		int p66Val = i163Provider.get(request);
		int p67Val = i166Provider.get(request);
		int p68Val = i167Provider.get(request);
		int p69Val = i168Provider.get(request);
		int p70Val = i169Provider.get(request);
		int p71Val = i172Provider.get(request);
		
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p72Val = i175Provider.get(request);
		int p73Val = i179Provider.get(request);
		int p74Val = i181Provider.get(request);
		int p75Val = i185Provider.get(request);
		int p76Val = i188Provider.get(request);
		int p77Val = i192Provider.get(request);
		int p78Val = i195Provider.get(request);

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
				p78Val;
    }
}
