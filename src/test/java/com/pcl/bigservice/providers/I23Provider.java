package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I23Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i25Provider;
    @Hard
    private final Provider<Integer> i26Provider;
    @Hard
    private final Provider<Integer> i28Provider;
    @Hard
    private final Provider<Integer> i29Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i32Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i43Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i48Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i57Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i83Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i182Provider;
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
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b10Provider.get(request);
		
        try {
            Thread.sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b12Provider.get(request);
		int p4Val = b14Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b19Provider.get(request);
		int p9Val = b21Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b26Provider.get(request);
		int p13Val = b29Provider.get(request);
		int p14Val = b31Provider.get(request);
		int p15Val = b32Provider.get(request);
		int p16Val = b34Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b36Provider.get(request);
		int p19Val = b37Provider.get(request);
		int p20Val = b38Provider.get(request);
		int p21Val = b43Provider.get(request);
		int p22Val = b46Provider.get(request);
		int p23Val = b49Provider.get(request);
		int p24Val = b50Provider.get(request);
		int p25Val = i25Provider.get(request);
		int p26Val = i26Provider.get(request);
		int p27Val = i28Provider.get(request);
		int p28Val = i29Provider.get(request);
		int p29Val = i30Provider.get(request);
		int p30Val = i31Provider.get(request);
		int p31Val = i32Provider.get(request);
		int p32Val = i34Provider.get(request);
		int p33Val = i37Provider.get(request);
		int p34Val = i38Provider.get(request);
		int p35Val = i39Provider.get(request);
		int p36Val = i43Provider.get(request);
		int p37Val = i44Provider.get(request);
		int p38Val = i47Provider.get(request);
		int p39Val = i48Provider.get(request);
		int p40Val = i55Provider.get(request);
		int p41Val = i56Provider.get(request);
		int p42Val = i57Provider.get(request);
		int p43Val = i60Provider.get(request);
		int p44Val = i62Provider.get(request);
		int p45Val = i63Provider.get(request);
		int p46Val = i66Provider.get(request);
		int p47Val = i67Provider.get(request);
		int p48Val = i68Provider.get(request);
		int p49Val = i71Provider.get(request);
		int p50Val = i72Provider.get(request);
		int p51Val = i77Provider.get(request);
		int p52Val = i80Provider.get(request);
		int p53Val = i83Provider.get(request);
		int p54Val = i85Provider.get(request);
		int p55Val = i86Provider.get(request);
		int p56Val = i90Provider.get(request);
		int p57Val = i91Provider.get(request);
		int p58Val = i92Provider.get(request);
		int p59Val = i94Provider.get(request);
		int p60Val = i97Provider.get(request);
		int p61Val = i98Provider.get(request);
		int p62Val = i103Provider.get(request);
		int p63Val = i104Provider.get(request);
		int p64Val = i105Provider.get(request);
		int p65Val = i106Provider.get(request);
		int p66Val = i107Provider.get(request);
		int p67Val = i108Provider.get(request);
		int p68Val = i109Provider.get(request);
		int p69Val = i110Provider.get(request);
		int p70Val = i114Provider.get(request);
		int p71Val = i115Provider.get(request);
		int p72Val = i117Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p73Val = i119Provider.get(request);
		int p74Val = i123Provider.get(request);
		int p75Val = i124Provider.get(request);
		
        try {
            Thread.sleep(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p76Val = i125Provider.get(request);
		int p77Val = i129Provider.get(request);
		int p78Val = i134Provider.get(request);
		int p79Val = i139Provider.get(request);
		int p80Val = i141Provider.get(request);
		int p81Val = i144Provider.get(request);
		int p82Val = i146Provider.get(request);
		int p83Val = i149Provider.get(request);
		int p84Val = i150Provider.get(request);
		int p85Val = i159Provider.get(request);
		int p86Val = i161Provider.get(request);
		int p87Val = i162Provider.get(request);
		int p88Val = i163Provider.get(request);
		int p89Val = i164Provider.get(request);
		int p90Val = i168Provider.get(request);
		int p91Val = i170Provider.get(request);
		int p92Val = i171Provider.get(request);
		int p93Val = i175Provider.get(request);
		int p94Val = i182Provider.get(request);
		int p95Val = i184Provider.get(request);
		int p96Val = i186Provider.get(request);
		int p97Val = i188Provider.get(request);
		int p98Val = i189Provider.get(request);
		int p99Val = i190Provider.get(request);
		int p100Val = i194Provider.get(request);
		int p101Val = i196Provider.get(request);
		int p102Val = i199Provider.get(request);

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
				p100Val +
				p101Val +
				p102Val;
    }
}
