package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I15Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i16Provider;
    @Hard
    private final Provider<Integer> i20Provider;
    @Hard
    private final Provider<Integer> i29Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i43Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i69Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b10Provider.get(request);
		int p3Val = b12Provider.get(request);
		int p4Val = b15Provider.get(request);
		int p5Val = b16Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b25Provider.get(request);
		
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b26Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b30Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b38Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b41Provider.get(request);
		int p17Val = b45Provider.get(request);
		int p18Val = b47Provider.get(request);
		int p19Val = b50Provider.get(request);
		int p20Val = i16Provider.get(request);
		int p21Val = i20Provider.get(request);
		int p22Val = i29Provider.get(request);
		int p23Val = i31Provider.get(request);
		int p24Val = i34Provider.get(request);
		int p25Val = i35Provider.get(request);
		int p26Val = i36Provider.get(request);
		int p27Val = i37Provider.get(request);
		int p28Val = i38Provider.get(request);
		int p29Val = i43Provider.get(request);
		int p30Val = i44Provider.get(request);
		int p31Val = i47Provider.get(request);
		int p32Val = i50Provider.get(request);
		int p33Val = i55Provider.get(request);
		int p34Val = i60Provider.get(request);
		int p35Val = i61Provider.get(request);
		int p36Val = i63Provider.get(request);
		int p37Val = i64Provider.get(request);
		int p38Val = i65Provider.get(request);
		int p39Val = i68Provider.get(request);
		int p40Val = i69Provider.get(request);
		int p41Val = i71Provider.get(request);
		int p42Val = i75Provider.get(request);
		int p43Val = i77Provider.get(request);
		
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p44Val = i79Provider.get(request);
		int p45Val = i80Provider.get(request);
		int p46Val = i82Provider.get(request);
		int p47Val = i86Provider.get(request);
		int p48Val = i98Provider.get(request);
		int p49Val = i99Provider.get(request);
		int p50Val = i107Provider.get(request);
		int p51Val = i108Provider.get(request);
		int p52Val = i110Provider.get(request);
		int p53Val = i111Provider.get(request);
		int p54Val = i115Provider.get(request);
		int p55Val = i118Provider.get(request);
		int p56Val = i119Provider.get(request);
		int p57Val = i120Provider.get(request);
		int p58Val = i121Provider.get(request);
		int p59Val = i125Provider.get(request);
		int p60Val = i126Provider.get(request);
		int p61Val = i135Provider.get(request);
		int p62Val = i138Provider.get(request);
		int p63Val = i148Provider.get(request);
		int p64Val = i149Provider.get(request);
		int p65Val = i150Provider.get(request);
		int p66Val = i152Provider.get(request);
		int p67Val = i155Provider.get(request);
		int p68Val = i156Provider.get(request);
		int p69Val = i158Provider.get(request);
		int p70Val = i162Provider.get(request);
		int p71Val = i164Provider.get(request);
		int p72Val = i165Provider.get(request);
		int p73Val = i167Provider.get(request);
		int p74Val = i169Provider.get(request);
		int p75Val = i171Provider.get(request);
		int p76Val = i175Provider.get(request);
		int p77Val = i179Provider.get(request);
		int p78Val = i181Provider.get(request);
		int p79Val = i183Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p80Val = i191Provider.get(request);
		int p81Val = i192Provider.get(request);
		int p82Val = i193Provider.get(request);
		int p83Val = i198Provider.get(request);

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
				p80Val +
				p81Val +
				p82Val +
				p83Val;
    }
}
