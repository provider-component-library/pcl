package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I3Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i4Provider;
    @Hard
    private final Provider<Integer> i5Provider;
    @Hard
    private final Provider<Integer> i8Provider;
    @Hard
    private final Provider<Integer> i10Provider;
    @Hard
    private final Provider<Integer> i11Provider;
    @Hard
    private final Provider<Integer> i15Provider;
    @Hard
    private final Provider<Integer> i16Provider;
    @Hard
    private final Provider<Integer> i18Provider;
    @Hard
    private final Provider<Integer> i19Provider;
    @Hard
    private final Provider<Integer> i23Provider;
    @Hard
    private final Provider<Integer> i24Provider;
    @Hard
    private final Provider<Integer> i26Provider;
    @Hard
    private final Provider<Integer> i29Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i32Provider;
    @Hard
    private final Provider<Integer> i33Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i41Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b18Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b26Provider.get(request);
		int p12Val = b29Provider.get(request);
		int p13Val = b30Provider.get(request);
		int p14Val = b42Provider.get(request);
		int p15Val = b45Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = b49Provider.get(request);
		int p18Val = i4Provider.get(request);
		int p19Val = i5Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p20Val = i8Provider.get(request);
		int p21Val = i10Provider.get(request);
		int p22Val = i11Provider.get(request);
		int p23Val = i15Provider.get(request);
		int p24Val = i16Provider.get(request);
		int p25Val = i18Provider.get(request);
		int p26Val = i19Provider.get(request);
		int p27Val = i23Provider.get(request);
		int p28Val = i24Provider.get(request);
		int p29Val = i26Provider.get(request);
		int p30Val = i29Provider.get(request);
		int p31Val = i30Provider.get(request);
		int p32Val = i32Provider.get(request);
		int p33Val = i33Provider.get(request);
		int p34Val = i34Provider.get(request);
		int p35Val = i35Provider.get(request);
		int p36Val = i39Provider.get(request);
		int p37Val = i41Provider.get(request);
		int p38Val = i42Provider.get(request);
		int p39Val = i44Provider.get(request);
		int p40Val = i47Provider.get(request);
		int p41Val = i49Provider.get(request);
		int p42Val = i52Provider.get(request);
		int p43Val = i53Provider.get(request);
		int p44Val = i54Provider.get(request);
		int p45Val = i60Provider.get(request);
		int p46Val = i62Provider.get(request);
		int p47Val = i63Provider.get(request);
		int p48Val = i64Provider.get(request);
		int p49Val = i68Provider.get(request);
		int p50Val = i73Provider.get(request);
		int p51Val = i74Provider.get(request);
		
        try {
            Thread.sleep(36);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p52Val = i78Provider.get(request);
		int p53Val = i79Provider.get(request);
		int p54Val = i89Provider.get(request);
		int p55Val = i91Provider.get(request);
		int p56Val = i92Provider.get(request);
		int p57Val = i95Provider.get(request);
		int p58Val = i97Provider.get(request);
		int p59Val = i98Provider.get(request);
		int p60Val = i99Provider.get(request);
		int p61Val = i101Provider.get(request);
		int p62Val = i103Provider.get(request);
		int p63Val = i107Provider.get(request);
		int p64Val = i110Provider.get(request);
		int p65Val = i112Provider.get(request);
		int p66Val = i113Provider.get(request);
		int p67Val = i114Provider.get(request);
		int p68Val = i115Provider.get(request);
		int p69Val = i116Provider.get(request);
		int p70Val = i118Provider.get(request);
		int p71Val = i119Provider.get(request);
		int p72Val = i120Provider.get(request);
		int p73Val = i122Provider.get(request);
		int p74Val = i123Provider.get(request);
		int p75Val = i126Provider.get(request);
		int p76Val = i129Provider.get(request);
		int p77Val = i130Provider.get(request);
		int p78Val = i133Provider.get(request);
		int p79Val = i138Provider.get(request);
		int p80Val = i139Provider.get(request);
		int p81Val = i140Provider.get(request);
		int p82Val = i141Provider.get(request);
		int p83Val = i147Provider.get(request);
		int p84Val = i148Provider.get(request);
		int p85Val = i152Provider.get(request);
		int p86Val = i158Provider.get(request);
		int p87Val = i161Provider.get(request);
		int p88Val = i162Provider.get(request);
		int p89Val = i171Provider.get(request);
		int p90Val = i172Provider.get(request);
		int p91Val = i173Provider.get(request);
		int p92Val = i175Provider.get(request);
		int p93Val = i179Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p94Val = i182Provider.get(request);
		int p95Val = i186Provider.get(request);
		int p96Val = i189Provider.get(request);
		int p97Val = i192Provider.get(request);
		int p98Val = i193Provider.get(request);
		int p99Val = i196Provider.get(request);
		int p100Val = i200Provider.get(request);

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
				p83Val +
				p84Val +
				p85Val +
				p86Val +
				p87Val +
				p88Val +
				p89Val +
				p90Val +
				p91Val +
				p92Val +
				p93Val +
				p94Val +
				p95Val +
				p96Val +
				p97Val +
				p98Val +
				p99Val +
				p100Val;
    }
}
