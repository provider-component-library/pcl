package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I95Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
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
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b5Provider.get(request);
		
        try {
            Thread.sleep(84);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(86);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b6Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b15Provider.get(request);
		int p8Val = b20Provider.get(request);
		int p9Val = b21Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b26Provider.get(request);
		int p12Val = b27Provider.get(request);
		int p13Val = b30Provider.get(request);
		int p14Val = b32Provider.get(request);
		int p15Val = b33Provider.get(request);
		int p16Val = b37Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b42Provider.get(request);
		int p19Val = b43Provider.get(request);
		int p20Val = b45Provider.get(request);
		int p21Val = b47Provider.get(request);
		int p22Val = b50Provider.get(request);
		int p23Val = i96Provider.get(request);
		int p24Val = i97Provider.get(request);
		int p25Val = i100Provider.get(request);
		int p26Val = i101Provider.get(request);
		int p27Val = i102Provider.get(request);
		int p28Val = i103Provider.get(request);
		int p29Val = i105Provider.get(request);
		int p30Val = i106Provider.get(request);
		int p31Val = i120Provider.get(request);
		int p32Val = i121Provider.get(request);
		int p33Val = i123Provider.get(request);
		int p34Val = i124Provider.get(request);
		int p35Val = i125Provider.get(request);
		int p36Val = i128Provider.get(request);
		int p37Val = i131Provider.get(request);
		int p38Val = i133Provider.get(request);
		int p39Val = i134Provider.get(request);
		int p40Val = i135Provider.get(request);
		int p41Val = i138Provider.get(request);
		int p42Val = i140Provider.get(request);
		int p43Val = i141Provider.get(request);
		int p44Val = i145Provider.get(request);
		int p45Val = i146Provider.get(request);
		int p46Val = i147Provider.get(request);
		int p47Val = i148Provider.get(request);
		int p48Val = i150Provider.get(request);
		int p49Val = i151Provider.get(request);
		int p50Val = i152Provider.get(request);
		int p51Val = i156Provider.get(request);
		
        try {
            Thread.sleep(76);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p52Val = i157Provider.get(request);
		int p53Val = i159Provider.get(request);
		int p54Val = i161Provider.get(request);
		int p55Val = i163Provider.get(request);
		int p56Val = i165Provider.get(request);
		int p57Val = i166Provider.get(request);
		int p58Val = i167Provider.get(request);
		int p59Val = i168Provider.get(request);
		int p60Val = i170Provider.get(request);
		int p61Val = i171Provider.get(request);
		int p62Val = i172Provider.get(request);
		int p63Val = i173Provider.get(request);
		int p64Val = i174Provider.get(request);
		int p65Val = i179Provider.get(request);
		int p66Val = i181Provider.get(request);
		int p67Val = i182Provider.get(request);
		int p68Val = i189Provider.get(request);
		int p69Val = i192Provider.get(request);
		int p70Val = i193Provider.get(request);
		int p71Val = i195Provider.get(request);
		int p72Val = i196Provider.get(request);
		int p73Val = i199Provider.get(request);

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
				p73Val;
    }
}
